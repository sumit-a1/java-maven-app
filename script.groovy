def buildJar() {
	echo "building the application....."
	sh 'mvn package'
}

def buildImage() {
	echo "building the application..."
	withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', UsernameVariable: 'USER')]) {
		sh 'docker build -t sumitjha1/my-repo:jma-2.1 .'
		sh "echo $PASS | docker login -u $USER --password-stdin"
		sh 'docker push sumitjha1/my-repo:jma-2.1'
	}
}

def deployApp() {
	echo 'deploying the application..."
}

return this

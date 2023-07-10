#!/user/bin/env groovy

@Library('jenkins-shared-library')
def gv
pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build Jar") {
            steps {
                script {
                    buildJar()
                }
            }
        }
        stage("build and push image") {
            steps {
                script {
                        buildImage 'sumitjha1/my-repo:jenkinssl-3.0'
                    dockerLogin()
                    dockerPush 'sumitjha1/my-repo:jenkinssl-3.0'
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deploy()
                }
            }
        }
    }
}
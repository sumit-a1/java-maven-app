#!/user/bin/env groovy

pipeline {
    agent none
    stages {
        stage('select micro services') {
            input {
                message "Select all micro services to deploy"
                ok "All selected!"
                parameters {
                    choice(name: 'MS1', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'input ms')
                    choice(name: 'MS2', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'input ms')
                    choice(name: 'MS3', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'input ms')
                }
<<<<<<< HEAD
            }
            steps {
                script {
                    echo "Hello, ${MS1}. Hello, ${MS2}. Hello ${MS3}."
                    MS1_TO_DEPLOY = MS1
                    MS2_TO_DEPLOY = MS2
                    env.MS3_TO_DEPLOY = MS3
=======
                stage('build') {
                        when {
                                expression {
                                        BRANCH_NAME == 'main'
                                }
                        }
                        steps {
                                script {
                                        echo "Building the application...."
                                }
                        }
                }
                stage('deploy') {
                        when {
                                expression {
                                        BRANCH_NAME == 'main'
                                }
                        }
                        steps {
                                script {
                                        echo "deploying the application...."
                                }
                        }
>>>>>>> a751fc16b49322fea3833a815638427958002bf3
                }
            }
        }
<<<<<<< HEAD
        stage('select single service') {
            input {
                message "Select single Micro Service t deploy?"
                parameters {
                    choice(name: 'MS5', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'second param with ')
                }
            }
        }
    }
}
=======
}

>>>>>>> a751fc16b49322fea3833a815638427958002bf3

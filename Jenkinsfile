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
        stage("build Image") {
            steps {
                script {
                    buildImage()
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
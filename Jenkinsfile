pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvnw.cmd clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvnw.cmd test'
            }
        }
        stage('Run') {
            steps {
                bat 'java -jar target\\*.jar'
            }
        }
    }
}

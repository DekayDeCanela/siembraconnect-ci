pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/DekayDeCanela/siembraconnect-ci.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Run') {
            steps {
                bat 'java -jar target\\*.jar'
            }
        }
    }
}

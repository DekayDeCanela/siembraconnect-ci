pipeline {
    agent any

    environment {
        JAVA_HOME = 'C:/Program Files/Java/jdk-17.0.17+10'
        PATH = "${JAVA_HOME}/bin;${env.PATH}"
    }

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
                bat 'java -jar target\\api-0.0.1-SNAPSHOT.jar --server.port=8081'
            }
        }
    }
}

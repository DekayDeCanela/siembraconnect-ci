pipeline {
    agent any

    environment {
        JAVA_HOME = 'C:\Program Files\Java\jdk-17.0.17+10'
        PATH = "${JAVA_HOME}\\bin;${PATH}"
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
                bat 'java -jar target\\*.jar'
            }
        }
    }
}

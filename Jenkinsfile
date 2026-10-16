pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat 'C:/apache-maven-3.10.0-bin/apache-maven-3.10.0/bin/mvn.cmd -B clean test package'
            }
        }
    }

    post {
        success {
            echo 'Java build and tests passed!'
        }
        failure {
            echo 'Build failed. Check the console output.'
        }
    }
}
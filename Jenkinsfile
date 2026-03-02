pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Это скачивает код из GitHub
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // bat — это команда для Windows
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
    post {
        always {
            // Пока мы не настроили плагин Allure, просто выведем сообщение
            echo 'Билд завершен, проверяю отчеты...'
        }
    }
}
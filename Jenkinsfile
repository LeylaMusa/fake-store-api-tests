pipeline {
    agent any

    tools {
        // Укажите здесь то же имя, которое вы дали в настройках (Шаг 1)
        maven 'M3'
    }

    stages {
        stage('Checkout') {
            steps { checkout scm }
        }
        stage('Build') {
            steps {
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
            echo 'Билд завершен, проверяю отчеты...'
        }
    }
}
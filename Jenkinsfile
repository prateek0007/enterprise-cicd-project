pipeline {
      agent any

      stages {
        stage('checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build and Test') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn -B clean verify'
                    } else { 
                        bat 'mvn -B clean verify'

                    }
                }
            }
        }

        post {
            success {
                echo 'BUILD SUCCESSFUL'
        }
            failure {
                echo 'BUILD FAILED'
            }
        }        

     
}

}


 post {
        always {
            junit allowEmptyResults: true,
                  testResults: '**/target/surefire-reports/*.xml'
        }

        success {
            echo 'CI PIPELINE SUCCESSFUL'
        }

        failure {
            echo 'CI PIPELINE FAILED'
        }
    }
}
def call(String msg) {
  echo msg
  pipeline {
    agent any
    
    stages {
      stage('shared-stage') {
        steps {
           echo "In shared stage"
        }
      
      }
    }
  }
}

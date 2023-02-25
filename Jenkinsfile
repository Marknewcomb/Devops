pipeline{
    agent any
    stages{
        stage("Clean"){
            steps{
                deleteDir()
            }

        }
		stage("Clone"){
		    steps{
		    	bat "git clone https://github.com/Marknewcomb/Devops.git"
		    }

		}
		stage("Build"){
		    steps{
		        dir("Devops"){
		            bat "mvn clean install"
		        }

		    }

		}

		stage("Deploy"){
		    steps{
		        dir("Devops"){
		            //bat "java -cp target/Devops-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.newcomb.java.Main"
		            bat "docker build -t devops1.0 ."
		            bat "docker login -u mnewcomb21 -p 196711aaAA!!"
		            bat "docker tag devops1.0 mnewcomb21/devops1.0"
		            bat "docker push mnewcomb21/devops1.0"
		        }

		    }

		}
		stage("Run"){
		    steps{
		        dir("Devops"){
		            bat "docker run mnewcomb21/devops1.0"
		        }

		    }

		}

    }

}

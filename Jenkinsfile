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
		            bat "java -cp target/Devops-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.newcomb.java.Main"
		        }

		    }

		}

    }

}

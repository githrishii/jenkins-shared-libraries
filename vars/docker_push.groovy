def call(String ImageName, String ImageTag, String DockerhubUser){
  echo "pushing image to dockerhub"
  withCredentials([usernamePassword(
         "credentialsId":"docker",
          passwordVariable:"dockerhubpass",
          usernameVariable:"dockerhubuser")]){
    
          sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
          sh "docker push ${DockerhubUser}/${ImageName}:${ImageTag}"
      }
}

# WordCount

**Build project steps:**
- './gradlew clean build'
- 'docker build -t YOUR_REPO/wordcount .'
- 'docker push YOUR_REPO/wordcount'
- check image by command: 'docker images'
- change your container image repository/name in file wordcount-kuber.yaml
- kubectl create -f wordcount-kuber.yaml
- kubectl get pods
- kubectl port-forward deployment/datapipeline-demo-deployment 8080:80

**Web UI - http://localhost:8080/swagger-ui.html**
# 🚀 DevOps Java App (Spring Boot + Docker + Kubernetes)



## 📌 Overview

This project demonstrates an **end-to-end DevOps pipeline** using a Java Spring Boot application — from development and containerization to cloud deployment on Kubernetes.

It showcases how to:

- Build and test a Spring Boot application  
- Containerize it using Docker  
- Push images to a container registry (Docker Hub or GCP Artifact Registry)  
- Deploy to a managed Kubernetes cluster (GKE Autopilot)  
- Automate everything using CI/CD pipelines  



## 🏗️ Tech Stack

- ☕ Java (Spring Boot)  
- 🐳 Docker  
- ☸️ Kubernetes (GKE Autopilot)  
- ⚙️ GitHub Actions (CI/CD)  
- ☁️ Docker Hub / GCP Artifact Registry  



## ⚙️ Features

- REST API endpoint  
- Fully containerized application  
- Kubernetes deployment manifests  
- Automated CI/CD pipeline  
- Cloud-native deployment workflow  



## 🧭 Architecture

    Developer
       ↓
    GitHub Repository
       ↓
    GitHub Actions CI/CD
       ↓
    Docker Build
       ↓
    Artifact Registry
       ↓
    GKE Autopilot Cluster
       ↓
    Live Application



## 🖥️ Demo
### 📸 Screenshots

Add your screenshots below:

- Application running locally
- Docker container logs
- Kubernetes pods/services
- GKE Autopilot dashboard



### 🎥 Video Walkthrough

Add your demo video link (YouTube / Loom)

### Demo Covers

- Building the Spring Boot application
- Containerizing with Docker
- Pushing the image to the container registry
- Deploying to GKE Autopilot
- Accessing the live Kubernetes service


## 🚀 Run Locally
    ./mvnw spring-boot:run

   👉 Open in browser:

    http://localhost:8080


## 🐳 Docker
### 🔨 Build Image
    docker build -t devops-java-app .
### ▶️ Run Container
    docker run -p 8080:8080 devops-java-app

## 📦 Push to Container Registry
### 🐳 Docker Hub
    docker tag devops-java-app <your-dockerhub-username>/devops-java-app

    docker push <your-dockerhub-username>/devops-java-app


### ☁️ GCP Artifact Registry
    gcloud auth configure-docker
    
    docker tag devops-java-app <region>-docker.pkg.dev/<project-id>/<repo>/devops-java-app

    docker push <region>-docker.pkg.dev/<project-id>/<repo>/devops-java-app


## ☸️ Kubernetes Deployment (GKE Autopilot)
### 📥 Apply Manifests
    kubectl apply -f k8s/
### 🔍 Verify Deployment
    kubectl get pods

    kubectl get services


## 🔁 CI/CD Pipeline

This project uses GitHub Actions to automate:

- Build & test the application
- Build Docker image
- Push image to container registry
- Deploy to Kubernetes (optional step)

✔ Pipeline triggers automatically on every push to the main branch.

## 🌐 Access the Application
- 🖥️ Local: http://localhost:8080
- ☸️ Kubernetes: via external service IP


## 📈 Future Improvements
- 📦 Add Helm charts for Kubernetes
- 📊 Add monitoring with Prometheus & Grafana
- 🪵 Add centralized logging (ELK / Cloud Logging)
- 📈 Enable Horizontal Pod Autoscaling (HPA)
- 🔐 Add Ingress + HTTPS security
- 🔄 Implement GitOps with ArgoCD


## 👤 Author
  Abubakar

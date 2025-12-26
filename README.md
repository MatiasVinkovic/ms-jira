


<h1 align="center">🎫 SAF - Microservice Jira</h1>

<p align="center">
  <strong>Moteur de gestion des tickets et orchestrateur de réparations.</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Service-Jira_Server-red?style=for-the-badge" alt="Service Jira">
  <img src="https://img.shields.io/badge/Engine-SAF_Spring-orange?style=for-the-badge" alt="Engine">
</p>

---

### 📝 Description
Le `ms-jira` agit comme le serveur de traitement. Il héberge l'acteur central `JiraActor` qui reçoit les demandes de création, suppression et consultation de tickets en provenance du réseau.

Fonctionnalités démontrées :
* **Auto-catégorisation** : Analyse des tickets et assignation à des acteurs "Réparateurs".
* **Supervision critique** : Redémarrage automatique du gestionnaire en cas de ticket corrompu.
* **Élasticité** : Création d'un acteur dédié par réparation et destruction après succès.
* **Architecture Réseau** : Exposition via une API REST gérée par le framework SAF.

---

### ⚙️ Configuration & Installation
> ⚠️ **Le détail des ports (8083), l'enregistrement Eureka et les schémas d'architecture sont disponibles sur Notion.**

<p align="center">
  <a href="https://steadfast-joke-7dd.notion.site/Documentation-utilisateur-2d13c854685d807c9b54d04518b6be74?source=copy_link">
    <img src="https://img.shields.io/badge/Consulter_la_Configuration-000000?style=for-the-badge&logo=notion&logoColor=white" alt="Lien Notion">
  </a>
</p>

---

### 🚀 Lancement Rapide
1. Démarrez l'annuaire Eureka.
2. Exécutez la classe `JiraApp.java`.

```bash
mvn spring-boot:run

# Projet "Activité Pratique N° 2 -  Spring Data JPA Hibernate"

Ce projet est divisé en trois parties, chacune correspondant à une branche différente :
- La partie 1 se trouve dans la branche `part1`.
- La partie 2 se trouve dans la branche `part2`.
- La partie 3 se trouve dans la branche `part3`.

## Partie 1

La partie 1 du projet consiste à implémenter les étapes suivantes :
### A.Utiliser base de données H2:
![H2](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/8711f9de-d28e-41db-82b7-db7fedea3d9b)
1. Créer un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombok
![cree projet a](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/a1caaae1-0348-4170-a236-f3af676df02a)
2. Créer l'entité JPA Product ayant les attributs :
    - private Long id;
    - private String name;
    - private double price;
    - private int quantity;
![Créer l'entité JPA Product](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/c6697b40-d2bc-4bf5-a873-f2ca29c54b4a)

3. Configurer l'unité de persistance dans le fichier application.properties 
![Configurer l'unité de persistance](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/4ef7d176-dd76-4359-ab1c-c3ea976516d5)

4. Créer l'interface JPA Repository basée sur Spring Data
![Créer l'interface JPA Repository](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/7431522d-fe9d-4984-84f7-6d44b5ce85b0)

5. Tester quelques opérations de gestion de produits:
![Tester quelques opérations de gestion de produits](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/c84f7419-b487-4875-8539-ec3bf21b6477)
### B. Utiliser base de données MySql:
1. **Configuration de la base de données MySQL**
   ![Mysql](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/a1bb9070-cee5-4477-8eab-a3a37a081e09)

2. **Ajout de la dépendance MySQL dans le fichier de configuration**
   ![Ajouter dépendance MySQL](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/bad7be62-86f7-4844-b295-c2bdd4f42af6)

3. **Configuration de l'unité de persistance dans le fichier application.properties**
   ![Configurer l'unité de persistance dans le fichier application properties](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/49139472-2193-41e1-a9b0-d216ee6d4c74)

4. **Accès à PhpMyAdmin pour la gestion de la base de données**
   ![Accéder à PhpMyAdmin](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/fb17b90a-72d4-4a0f-8579-4f0d5c6beff4)

5. **Création d'un Web Service pour interagir avec la base de données MySQL**
   ![Créer un Web Service](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/91754ebd-374e-40b0-a95c-af7420fa0cf9)

## Partie 2

## 1. Créer un projet Spring Maven

Commencez par créer un projet Spring Maven en utilisant Maven pour la gestion des dépendances et la structure du projet.

![cree projet](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/ac96ca22-c877-4b2f-850f-3e531e89afd4)

---version1---

## 2. Créer des entités

Définissez les entités nécessaires pour votre application, telles que les classes Java représentant les objets métier.

![Entities](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/d08c1bf9-7021-47c2-88f2-afe54ce49d8a)
![image](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/37f034c4-c198-4163-93d4-e17065b7a00b)

## 3. Créer un référentiel (Repository)

Créez des interfaces de référentiel pour interagir avec la base de données, en utilisant Spring Data JPA par exemple.

![repo](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/2394f4cf-964a-48e6-b7c3-72d7c877da7e)
![Patrepo](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/80df90e2-e5eb-414c-a489-d45ebf29046b)

## 4. Utiliser une base de données H2

Configurez votre application pour utiliser la base de données H2 pour un développement rapide et des tests simples.
![pro](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/7950ad4e-c948-45e8-8a94-1136df223a4e)

![h2](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/6ba700c0-3640-49dc-ad35-cbe8c066e069)

![h2 db](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/5e1657f8-1a14-4613-9f2a-5d18497d6423)

## 5. Tester l'application avec CommandLineRunner

Ajoutez un CommandLineRunner pour tester votre application en exécutant du code au démarrage.
![code](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/b22bf1cc-a551-4678-a8ab-18c0db25e831)

---version2---

## 6. Ajouter un Service

Introduisez une couche de service pour encapsuler la logique métier de votre application.

![SE](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/683857b8-7380-40bc-a2b0-0a5084833c3e)

![ser](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/f83596b2-af0b-4828-954f-ab329779c354)

## 7. Implémenter le Service

Implémentez les méthodes définies dans votre couche de service.
![serimpl](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/5f0a5ea6-0d01-40e3-a5c9-7cfd351a2197)
![serimpl2](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/0020d315-7995-4442-9cf7-e5a6430891fe)

## 8. Tester l'application avec CommandLineRunner en utilisant le Service

Modifiez votre CommandLineRunner pour utiliser les services que vous avez créés et testez l'application avec ceux-ci.

![USES](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/e1ec35b0-41d1-4345-9541-5c6b91647974)

---version3---

## 9. Ajouter une partie Web avec un contrôleur

Dans cette version, nous ajoutons une partie Web à notre projet en introduisant un contrôleur pour gérer les requêtes HTTP.
![rest](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/99097875-46a7-4797-a425-fda5f6148222)
![web](https://github.com/S-AHANSAL/Ahansal_Activite-Pratique-N-2-Spring-Data-JPA-Hibernate/assets/81721069/0ea9b157-d51e-4449-b2f0-a09f8828ccf2)

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

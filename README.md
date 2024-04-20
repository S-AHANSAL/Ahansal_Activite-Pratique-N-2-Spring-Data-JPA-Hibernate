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


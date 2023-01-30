Pour créer la connexion avec la base de donnes, j’ai crée un Connection et avec la méthode getConnection 
j’ai précisé l’url : "jdbc:mysql://localhost:3306/devoir1" , le user et le password.
Apres avoir crée un statement, je récupère les résultats de la base de donne dans un resultSet avec la 
méthode executeQuery.
Pour afficher le résultat, je crée une loop, qui grâce à la méthode next, change le curseur de ligne en ligne, 
et affiche la colonne mise en argument dans la méthode getString.
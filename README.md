# My User Interface App

Bienvenue dans My User Interface App, une application Android simple pour gérer votre interface utilisateur avec un menu latéral, des boutons de navigation, et des activités supplémentaires. Naviguez facilement entre les différentes sections et explorez l'interface de manière fluide et efficace !

## Fonctionnalités

   - Ouverture et gestion d'un menu latéral (Drawer Menu).
   - Navigation entre différentes activités (par exemple, une activité secondaire).
   - Interaction avec des boutons de navigation pour faciliter l'expérience utilisateur.
   - Interface simple et conviviale avec un design propre.

## Prérequis

    Android Studio (pour construire et exécuter l'application).
    JDK 8 ou supérieur.

## Installation

Clonez le dépôt sur votre machine locale :

git clone https://github.com/votre-utilisateur/my-user-interface-app.git

   1. Ouvrez le projet dans Android Studio.
   2. Cliquez sur Build > Make Project pour synchroniser le projet avec Gradle.
   3. Lancez l'application sur un appareil ou un émulateur Android.

## Structure du projet

Le projet est structuré de manière à séparer les différentes activités et composants. Voici les principaux fichiers et dossiers que vous trouverez :

   - MainActivity.kt : Activité principale qui contient la logique pour ouvrir le menu latéral et gérer les boutons de navigation.
   - SecondActivity.kt : Activité secondaire qui est lancée via le bouton dans l'activité principale.
   - activity_main.xml : Le fichier de mise en page pour l'interface utilisateur de la MainActivity.
   - activity_second.xml : Mise en page pour la SecondActivity avec un RecyclerView pour afficher des éléments.
   - nav_menu.xml : Menu de navigation pour le NavigationView.
   - nav_header.xml : En-tête du menu de navigation (peut être personnalisé pour afficher des informations de l'utilisateur).

## Auteure

Nom de l'auteure : Salamata Nourou MBAYE

## Vidéo de présentation de l'app
[![Vidéo de présentation]("C:\Users\DELL\AndroidStudioProjects\Screen_recording_UIApp.webm")

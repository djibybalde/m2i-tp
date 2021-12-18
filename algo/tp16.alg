<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHERCALCUL sum/taille" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2defaut="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" arrondiAuto="vrai" epaisseurPoint="2" totalBoucles="5000000" nbDecimales="8" totalAffichages="1000" epaisseurLigne="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="numbers EST_DU_TYPE LISTE" code="1#LISTE#numbers"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="taille EST_DU_TYPE NOMBRE" code="1#NOMBRE#taille"/>
        <item algoitem="sum EST_DU_TYPE NOMBRE" code="1#NOMBRE#sum"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="LIRE taille" code="2#taille#pasliste"/>
        <item algoitem="//Remplissage du tableau" code="19#Remplissage du tableau"/>
        <item algoitem="POUR i ALLANT_DE 0 A taille-1" code="12#i#0#taille-1">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="LIRE numbers[i]" code="2#numbers#i"/>
            <item algoitem="sum PREND_LA_VALEUR sum+numbers[i]" code="5#sum#sum+numbers[i]#pasliste"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="//Affichage du tableau" code="19#Affichage du tableau"/>
        <item algoitem="AFFICHER &quot;Numbers : [ &quot;" code="4#Numbers : [ #0"/>
        <item algoitem="POUR i ALLANT_DE 0 A taille-1" code="12#i#0#taille-1">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="AFFICHERCALCUL numbers[i]" code="20#numbers[i]#0"/>
            <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER &quot; ]&quot;" code="4# ]#1"/>
        <item algoitem="AFFICHER &quot;Somme: &quot;" code="4#Somme: #0"/>
        <item algoitem="AFFICHER sum" code="3#sum#1#pasliste"/>
        <item algoitem="AFFICHER &quot;Moyenne: &quot;" code="4#Moyenne: #0"/>
        <item algoitem="AFFICHERCALCUL sum/taille" code="20#sum/taille#1"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>

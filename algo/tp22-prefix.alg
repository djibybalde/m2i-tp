<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="//AFFICHER p"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2etat="inactif" F2para="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalBoucles="5000000" epaisseurLigne="2" arrondiAuto="vrai" epaisseurPoint="2" maxBoucle="500000" totalAffichages="1000" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions">
        <item algoitem="FONCTION checkPrefix(text, character)" code="201#checkPrefix#text, character">
            <item algoitem="VARIABLES_FONCTION" code="202#declarationsvariablesfonction"/>
            <item algoitem="DEBUT_FONCTION" code="203#debutfonction"/>
            <item algoitem="RENVOYER text" code="205#text"/>
            <item algoitem="FIN_FONCTION" code="204#finfonction"/>
        </item>
    </item>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="text EST_DU_TYPE CHAINE" code="1#CHAINE#text"/>
        <item algoitem="prefix EST_DU_TYPE CHAINE" code="1#CHAINE#prefix"/>
        <item algoitem="p EST_DU_TYPE CHAINE" code="1#CHAINE#p"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="LIRE text" code="2#text#pasliste"/>
        <item algoitem="LIRE prefix" code="2#prefix#pasliste"/>
        <item algoitem="//p PREND_LA_VALEUR checkPrefix(text, prefix)" code="19#p PREND_LA_VALEUR checkPrefix(text, prefix)"/>
        <item algoitem="//AFFICHER p" code="19#AFFICHER p"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>

<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHERCALCUL calculerPuissance(text, prefix)" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" nbDecimales="8" epaisseurLigne="2" totalAffichages="1000" arrondiAuto="vrai" epaisseurPoint="2" totalBoucles="5000000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions">
        <item algoitem="FONCTION calculerPuissance(text, prefix)" code="201#calculerPuissance#text, prefix">
            <item algoitem="VARIABLES_FONCTION" code="202#declarationsvariablesfonction">
                <item algoitem="result EST_DU_TYPE CHAINE" code="1#CHAINE#result"/>
            </item>
            <item algoitem="DEBUT_FONCTION" code="203#debutfonction"/>
            <item algoitem="SI (prefix == &quot;dji&quot;) ALORS" code="6#prefix == &quot;dji&quot;">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="result PREND_LA_VALEUR text" code="5#result#text#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
            </item>
            <item algoitem="RENVOYER result" code="205#result"/>
            <item algoitem="FIN_FONCTION" code="204#finfonction"/>
        </item>
    </item>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="text EST_DU_TYPE CHAINE" code="1#CHAINE#text"/>
        <item algoitem="prefix EST_DU_TYPE CHAINE" code="1#CHAINE#prefix"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="LIRE text" code="2#text#pasliste"/>
        <item algoitem="LIRE prefix" code="2#prefix#pasliste"/>
        <item algoitem="AFFICHERCALCUL calculerPuissance(text, prefix)" code="20#calculerPuissance(text, prefix)#1"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>

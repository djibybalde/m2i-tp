<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER num"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2lignes="" F2defaut="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" totalBoucles="5000000" arrondiAuto="vrai" nbDecimales="8" maxBoucle="500000" epaisseurPoint="2" totalAffichages="1000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="chain EST_DU_TYPE CHAINE" code="1#CHAINE#chain"/>
        <item algoitem="reverse EST_DU_TYPE CHAINE" code="1#CHAINE#reverse"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="num EST_DU_TYPE NOMBRE" code="1#NOMBRE#num"/>
        <item algoitem="neg EST_DU_TYPE NOMBRE" code="1#NOMBRE#neg"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="LIRE num" code="2#num#pasliste"/>
        <item algoitem="SI (num &lt; 0) ALORS" code="6#num &lt; 0">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="neg PREND_LA_VALEUR 1" code="5#neg#1#pasliste"/>
            <item algoitem="num PREND_LA_VALEUR num * (-1)" code="5#num#num * (-1)#pasliste"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="neg PREND_LA_VALEUR 0" code="5#neg#0#pasliste"/>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
        <item algoitem="chain PREND_LA_VALEUR num.toString()" code="5#chain#num.toString()#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 1 A (chain.length)" code="12#i#1#(chain.length)">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="reverse PREND_LA_VALEUR reverse  + chain[chain.length-i]" code="5#reverse#reverse  + chain[chain.length-i]#pasliste"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="//AFFICHER* reverse" code="19#AFFICHER* reverse"/>
        <item algoitem="num PREND_LA_VALEUR 0" code="5#num#0#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 1 A reverse.length" code="12#i#1#reverse.length">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="num PREND_LA_VALEUR num + reverse[reverse.length-i]*pow(10,i-1)" code="5#num#num + reverse[reverse.length-i]*pow(10,i-1)#pasliste"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="SI (neg == 1) ALORS" code="6#neg == 1">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="num PREND_LA_VALEUR num * (-1)" code="5#num#num * (-1)#pasliste"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="AFFICHER num" code="3#num#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>

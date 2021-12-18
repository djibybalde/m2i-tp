<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="//  FIN_SINON" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" epaisseurLigne="2" arrondiAuto="vrai" maxBoucle="500000" totalBoucles="5000000" epaisseurPoint="2" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="age EST_DU_TYPE NOMBRE" code="1#NOMBRE#age"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="LIRE age" code="2#age#pasliste"/>
        <item algoitem="SI (age>=7 ET age&lt;=9) ALORS" code="6#age>=7 ET age&lt;=9">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;Poussin&quot;" code="4#Poussin#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="SI (age>=10 ET age&lt;=11) ALORS" code="6#age>=10 ET age&lt;=11">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;Pupille&quot;" code="4#Pupille#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="SI (age>=12 ET age&lt;=13) ALORS" code="6#age>=12 ET age&lt;=13">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;Benjamin&quot;" code="4#Benjamin#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="SI (age>=14 ET age&lt;=15) ALORS" code="6#age>=14 ET age&lt;=15">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;Minime&quot;" code="4#Minime#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="SI (age>=16 ET age&lt;=17) ALORS" code="6#age>=16 ET age&lt;=17">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;Cadet&quot;" code="4#Cadet#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="//SINON" code="19#SINON"/>
        <item algoitem="//  DEBUT_SINON" code="19#  DEBUT_SINON"/>
        <item algoitem="//  &#x9;&#x9;AFFICHER &quot;T'est pas concerné(e)&quot;" code="19#  &#x9;&#x9;AFFICHER &quot;T'est pas concerné(e)&quot;"/>
        <item algoitem="//  FIN_SINON" code="19#  FIN_SINON"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>

<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_SINON" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2etat="inactif" F2defaut="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" totalAffichages="1000" maxBoucle="500000" epaisseurLigne="2" totalBoucles="5000000" nbDecimales="8" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#CHAINE#phrase" algoitem="phrase EST_DU_TYPE CHAINE"/>
        <item code="1#CHAINE#character" algoitem="character EST_DU_TYPE CHAINE"/>
        <item code="1#NOMBRE#characterCount" algoitem="characterCount EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="2#phrase#pasliste" algoitem="LIRE phrase"/>
        <item code="2#character#pasliste" algoitem="LIRE character"/>
        <item code="12#i#0#phrase.length-1" algoitem="POUR i ALLANT_DE 0 A phrase.length-1">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="6#phrase.substr(i,1) == character" algoitem="SI (phrase.substr(i,1) == character) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#characterCount#characterCount+1#pasliste" algoitem="characterCount PREND_LA_VALEUR characterCount+1"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="3#character#0#pasliste" algoitem="AFFICHER character"/>
        <item code="4# apparaît #0" algoitem="AFFICHER &quot; apparaît &quot;"/>
        <item code="3#characterCount#0#pasliste" algoitem="AFFICHER characterCount"/>
        <item code="4# fois dans la chaine#0" algoitem="AFFICHER &quot; fois dans la chaine&quot;"/>
        <item code="6#character==&quot;a&quot; OU character==&quot;e&quot; OU character==&quot;i&quot; OU character==&quot;o&quot; OU character==&quot;u&quot; OU character==&quot;y&quot;" algoitem="SI (character==&quot;a&quot; OU character==&quot;e&quot; OU character==&quot;i&quot; OU character==&quot;o&quot; OU character==&quot;u&quot; OU character==&quot;y&quot;) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#et c'est une voyelle#0" algoitem="AFFICHER &quot;et c'est une voyelle&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="4#et c'est une consonne#0" algoitem="AFFICHER &quot;et c'est une consonne&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>

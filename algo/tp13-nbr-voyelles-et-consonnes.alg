<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER nbreConsonnes" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2etat="inactif" F2defaut="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" totalAffichages="1000" maxBoucle="500000" epaisseurLigne="5" totalBoucles="5000000" nbDecimales="8" epaisseurPoint="5"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#CHAINE#phrase" algoitem="phrase EST_DU_TYPE CHAINE"/>
        <item code="1#NOMBRE#nbreVoyelles" algoitem="nbreVoyelles EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbreConsonnes" algoitem="nbreConsonnes EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="2#phrase#pasliste" algoitem="LIRE phrase"/>
        <item code="12#i#0#phrase.length-1" algoitem="POUR i ALLANT_DE 0 A phrase.length-1">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="6#phrase.substr(i,1)==&quot;a&quot; OU phrase.substr(i,1)==&quot;e&quot; OU phrase.substr(i,1)==&quot;i&quot; OU phrase.substr(i,1)==&quot;u&quot; OU phrase.substr(i,1)==&quot;y&quot; OU phrase.substr(i,1)==&quot;o&quot;" algoitem="SI (phrase.substr(i,1)==&quot;a&quot; OU phrase.substr(i,1)==&quot;e&quot; OU phrase.substr(i,1)==&quot;i&quot; OU phrase.substr(i,1)==&quot;u&quot; OU phrase.substr(i,1)==&quot;y&quot; OU phrase.substr(i,1)==&quot;o&quot;) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#nbreVoyelles#nbreVoyelles+1#pasliste" algoitem="nbreVoyelles PREND_LA_VALEUR nbreVoyelles+1"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="5#nbreConsonnes#nbreConsonnes+1#pasliste" algoitem="nbreConsonnes PREND_LA_VALEUR nbreConsonnes+1"/>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="4#Voyelles : #0" algoitem="AFFICHER &quot;Voyelles : &quot;"/>
        <item code="3#nbreVoyelles#1#pasliste" algoitem="AFFICHER nbreVoyelles"/>
        <item code="4#Consonnes : #0" algoitem="AFFICHER &quot;Consonnes : &quot;"/>
        <item code="3#nbreConsonnes#1#pasliste" algoitem="AFFICHER nbreConsonnes"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>

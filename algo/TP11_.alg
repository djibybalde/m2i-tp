<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="SI (chain[i] == &quot; &quot;) ALORS" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2etat="inactif" F2defaut="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" totalAffichages="1000" maxBoucle="500000" epaisseurLigne="2" totalBoucles="5000000" nbDecimales="8" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#CHAINE#chain" algoitem="chain EST_DU_TYPE CHAINE"/>
        <item code="1#CHAINE#reverse" algoitem="reverse EST_DU_TYPE CHAINE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="2#chain#pasliste" algoitem="LIRE chain"/>
        <item code="15#chain[0] == &quot; &quot;" algoitem="TANT_QUE (chain[0] == &quot; &quot;) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="5#chain#chain.substr(1,chain.length-1)#pasliste" algoitem="chain PREND_LA_VALEUR chain.substr(1,chain.length-1)"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="15#chain[chain.length-1] == &quot; &quot;" algoitem="TANT_QUE (chain[chain.length-1] == &quot; &quot;) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="5#chain#chain.substr(0,chain.length-1)#pasliste" algoitem="chain PREND_LA_VALEUR chain.substr(0,chain.length-1)"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="12#i#0#(chain.length-1)" algoitem="POUR i ALLANT_DE 0 A (chain.length-1)">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="6#chain[i] == &quot; &quot;" algoitem="SI (chain[i] == &quot; &quot;) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#chain#chain.substr(0,i) + chain.substr(i+1,chain.length-1)#pasliste" algoitem="chain PREND_LA_VALEUR chain.substr(0,i) + chain.substr(i+1,chain.length-1)"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="12#i#1#(chain.length)" algoitem="POUR i ALLANT_DE 1 A (chain.length)">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#reverse#reverse  + chain[chain.length-i]#pasliste" algoitem="reverse PREND_LA_VALEUR reverse  + chain[chain.length-i]"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="6#chain == reverse" algoitem="SI (chain == reverse) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Cette chaine de caractères est un palindrome.#0" algoitem="AFFICHER &quot;Cette chaine de caractères est un palindrome.&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="4#Cette chaine de caractères n'est pas un palindrome.#0" algoitem="AFFICHER &quot;Cette chaine de caractères n'est pas un palindrome.&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>

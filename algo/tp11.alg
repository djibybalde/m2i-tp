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
        <item code="1#CHAINE#strName" algoitem="strName EST_DU_TYPE CHAINE"/>
        <item code="1#CHAINE#strCarater" algoitem="strCarater EST_DU_TYPE CHAINE"/>
        <item code="1#CHAINE#strRvrs" algoitem="strRvrs EST_DU_TYPE CHAINE"/>
        <item code="1#NOMBRE#strLen" algoitem="strLen EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="2#strName#pasliste" algoitem="LIRE strName"/>
        <item code="5#strLen#strName.length#pasliste" algoitem="strLen PREND_LA_VALEUR strName.length"/>
        <item code="12#i#0#strLen" algoitem="POUR i ALLANT_DE 0 A strLen">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="6#strName.substr(strLen-i, 1) != &quot; &quot;" algoitem="SI (strName.substr(strLen-i, 1) != &quot; &quot;) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#strRvrs#strRvrs+strName.substr(strLen-i, 1)#pasliste" algoitem="strRvrs PREND_LA_VALEUR strRvrs+strName.substr(strLen-i, 1)"/>
                <item code="5#strCarater#strCarater+strName.substr(i, 1)#pasliste" algoitem="strCarater PREND_LA_VALEUR strCarater+strName.substr(i, 1)"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="5#strRvrs#strRvrs+strName.substr(strLen-i, 1)#pasliste" algoitem="strRvrs PREND_LA_VALEUR strRvrs+strName.substr(strLen-i, 1)"/>
                    <item code="5#strCarater#strCarater+strName.substr(i, 1)#pasliste" algoitem="strCarater PREND_LA_VALEUR strCarater+strName.substr(i, 1)"/>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="6#strRvrs==strCarater" algoitem="SI (strRvrs==strCarater) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="3#strCarater#1#pasliste" algoitem="AFFICHER strCarater"/>
            <item code="3#strRvrs#1#pasliste" algoitem="AFFICHER strRvrs"/>
            <item code="4#Cette chaine est un palindrome !#0" algoitem="AFFICHER &quot;Cette chaine est un palindrome !&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="3#strCarater#1#pasliste" algoitem="AFFICHER strCarater"/>
                <item code="3#strRvrs#1#pasliste" algoitem="AFFICHER strRvrs"/>
                <item code="4#Cette chaine n'est pas un palindrome !#0" algoitem="AFFICHER &quot;Cette chaine n'est pas un palindrome !&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>

<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER strRvrs" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2lignes="" F2para="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" epaisseurLigne="2" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2" arrondiAuto="vrai" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="strName EST_DU_TYPE CHAINE" code="1#CHAINE#strName"/>
        <item algoitem="strRvrs EST_DU_TYPE CHAINE" code="1#CHAINE#strRvrs"/>
        <item algoitem="strLen EST_DU_TYPE NOMBRE" code="1#NOMBRE#strLen"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="LIRE strName" code="2#strName#pasliste"/>
        <item algoitem="strLen PREND_LA_VALEUR strName.length" code="5#strLen#strName.length#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 0 A strLen" code="12#i#0#strLen">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="strRvrs PREND_LA_VALEUR strRvrs+strName.substr(strLen-i, 1)" code="5#strRvrs#strRvrs+strName.substr(strLen-i, 1)#pasliste"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER strRvrs" code="3#strRvrs#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>

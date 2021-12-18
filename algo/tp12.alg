<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER nbRvrs" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2lignes="" F2para="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" epaisseurLigne="2" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2" arrondiAuto="vrai" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nb EST_DU_TYPE NOMBRE" code="1#NOMBRE#nb"/>
        <item algoitem="nbTOStr EST_DU_TYPE CHAINE" code="1#CHAINE#nbTOStr"/>
        <item algoitem="nbRvrs EST_DU_TYPE CHAINE" code="1#CHAINE#nbRvrs"/>
        <item algoitem="strLen EST_DU_TYPE NOMBRE" code="1#NOMBRE#strLen"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="LIRE nb" code="2#nb#pasliste"/>
        <item algoitem="nbTOStr PREND_LA_VALEUR nb.toString()" code="5#nbTOStr#nb.toString()#pasliste"/>
        <item algoitem="strLen PREND_LA_VALEUR nbTOStr.length" code="5#strLen#nbTOStr.length#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 1 A strLen" code="12#i#1#strLen">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="nbRvrs PREND_LA_VALEUR nbRvrs+nbTOStr.substr(strLen-i-1, 1)" code="5#nbRvrs#nbRvrs+nbTOStr.substr(strLen-i-1, 1)#pasliste"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER nbRvrs" code="3#nbRvrs#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>

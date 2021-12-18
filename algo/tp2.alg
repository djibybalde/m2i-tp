<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_TANT_QUE"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" maxBoucle="500000" epaisseurLigne="2" totalAffichages="1000" totalBoucles="5000000" nbDecimales="8" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="email EST_DU_TYPE CHAINE" code="1#CHAINE#email"/>
        <item algoitem="password EST_DU_TYPE CHAINE" code="1#CHAINE#password"/>
        <item algoitem="emailToLog EST_DU_TYPE CHAINE" code="1#CHAINE#emailToLog"/>
        <item algoitem="passwordToLog EST_DU_TYPE CHAINE" code="1#CHAINE#passwordToLog"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="// Creation de compte" code="19# Creation de compte"/>
        <item algoitem="LIRE email" code="2#email#pasliste"/>
        <item algoitem="LIRE password" code="2#password#pasliste"/>
        <item algoitem="TANT_QUE (emailToLog !=email OU passwordToLog!=password) FAIRE" code="15#emailToLog !=email OU passwordToLog!=password">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="LIRE emailToLog" code="2#emailToLog#pasliste"/>
            <item algoitem="LIRE passwordToLog" code="2#passwordToLog#pasliste"/>
            <item algoitem="SI (emailToLog !=email OU passwordToLog!=password) ALORS" code="6#emailToLog !=email OU passwordToLog!=password">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;Identifiants incorrect&quot;" code="4#Identifiants incorrect#0"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="AFFICHER &quot;Bienvenu dans votre espace client&quot;" code="4#Bienvenu dans votre espace client#0"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>

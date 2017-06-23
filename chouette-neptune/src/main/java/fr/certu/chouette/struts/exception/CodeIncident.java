package fr.certu.chouette.struts.exception;

public enum CodeIncident {
    FATAL00001,
    FATAL00002,
    ERROR00002,
    WARNING00002,
    FATAL00003,
    ERROR00003,
    FATAL00004,

    EXPORT_SANS_RESEAU,
    EXPORT_SANS_TRANSPORTEUR,
    FILE_NOT_FOUND,
    CONNEXION_BASE,
    ERREUR_SQL,
    ERREUR_FICHIER,
    DONNEE_INVALIDE, IDENTIFIANT_INCONNU,
    CONTRAINTE_INVALIDE,
    IDENTIFIANT_TRIDENT_INCONNU,
    BASE_NON_INTEGRE, ASSOCIATION_ZONES_INVALIDE,
    PROFONDEUR_ZONES_INVALIDE,
    RECURSIVITE_INTER_ZONES,
    NO_REGISTRE_NON_UNIQUE, NO_REGISTRE_INCONNU,
    ERR_LECT_TRSP_ABSENT,
    ERR_LECT_REGISTRE_TRSP_ABSENT,
    ERR_LECT_RES_ABSENT,
    ERR_LECT_REGISTRE_RES_ABSENT,
    ERR_LECT_LIG_ABSENT,
    ERR_LECT_REGISTRE_LIG_ABSENT,
    ERR_LECT_TRONCON_NON_DEFINI,
    ERR_LECT_ARRET_NON_DEFINI,
    ERR_LECT_ID_AREA_INCONNU,
    ERR_LECT_ID_CENTROID_INCONNU,
    ERR_LECT_ZONE_NON_TYPEE,
    ERR_ARRETS_RELIES,
    ERR_CSV_FORMAT_INVALIDE,
    ERR_CSV_FORMAT_COLONNE,
    ERR_CSV_FORMAT_LIGNE,
    ERR_CSV_CELLULE_INTROUVABLE,
    ERR_CSV_NON_TROUVE,
    ERR_XML_ECRITURE,
    ERR_XML_FORMAT,
    COMPARATOR_UNVAILABLE_RESOURCE,
    COMPARATOR_UNBUILD_RESOURCE,
    COMPARATOR_DUPLICATED_KEY,
    COMPARATOR_BEAN_INITIALIZATION_FAILED
}

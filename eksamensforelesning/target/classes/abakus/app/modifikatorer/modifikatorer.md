# Modifikatorer

**Eksempel:**

```
public static final int pin_kode = 1234;
```


## Innkapsling

[Link til Wiki](https://www.ntnu.no/wiki/display/tdt4100/Innkapsling)

Innkapsling er en programmeringsteknikk som har som formål å hindre direkte tilgang til tilstanden til et objekt fra objekter av andre klasser.

Motivasjonen for innkapsling er todelt:

- Det er viktig å sikre at tilstanden til alle objektene er gyldig. Dette gjøres best ved at alle endringer av tilstanden skjer ved å kalle objektets metoder, heller enn å endre på attributtene direkte. På denne måten slipper andre objekter å kjenne til alle reglene for gyldighet og konsistens, og koden blir mer robust ved at all logikk om attributter og regler samles i én klasse.
- Det er viktig at koden for en klasse ikke er avhengig av detaljer i en annen, f.eks. eksakt hvilke attributter og datatyper som brukes for å representere data, fordi dette gjør endringer lettere å håndtere.

Du har tre innkapslingsmodifikatorer:
- private - dersom noe har private-modifikasjon har kun klassen den ligger i tilgang til den
- public - Alle har tilgang til denne
- protected - kommer tilbake til denne i **arv**

## Andre modifikatorer
- static: Ressurs som er felles mellom alle _objekter_ av samme _klasse_
- final: Denne variabelen kan ikke endres
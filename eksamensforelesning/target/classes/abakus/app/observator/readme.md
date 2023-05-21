# Observasjon

## I følge Chat GPT:

I Java er en observatør (Observer) et designmønster som brukes til å opprette en en-til-mange-relasjon mellom objekter. Mønsteret lar et objekt, kjent som subjektet, informere og oppdatere en liste over avhengige objekter, kjent som observatører, når en endring skjer i subjektet.

Observatørmønsteret består av følgende hovedkomponenter:

    Subject (Subjekt): Dette er objektet som blir observert. Det holder en liste over alle sine observatører og gir metoder for å legge til og fjerne observatører samt varsle dem om endringer.

    Observer (Observatør): Dette er grensesnittet som definerer metodene som brukes av observatørene for å motta oppdateringer fra subjektet. Vanligvis inneholder grensesnittet en metode (for eksempel "update()") som blir kalt av subjektet for å varsle om endringer.

    ConcreteSubject (Konkret subjekt): Dette er implementasjonen av subjektet. Det inneholder den faktiske logikken for å overvåke og varsle observatørene når det skjer endringer.

    ConcreteObserver (Konkret observatør): Dette er implementasjonen av observatørgrensesnittet. Hver konkret observatør oppdateres av subjektet når det skjer endringer ved å kalles av subjektet.

Ved å bruke observatørmønsteret kan du oppnå løs kobling mellom subjektet og observatørene. Dette betyr at subjektet ikke trenger å kjenne til de spesifikke observatørene, bare grensesnittet deres. På denne måten kan du enkelt legge til eller fjerne observatører uten å påvirke subjektet eller andre observatører.

Observatørmønsteret er nyttig i mange situasjoner der du trenger å oppdatere flere objekter når et annet objekt endrer tilstand. Det brukes ofte i grafiske brukergrensesnitt (GUI) og hendelsesbaserte systemer der flere komponenter trenger å reagere på brukerhandlinger eller systemhendelser.

## I følge meg:
Når du vil følge med på mange ting, er det greit å kunne standardisere måten noen tar kontakt med deg på. Så slipper du å forholde deg til Slack, Messenger, Meldinger, Ringing, Person på gata, Ringeklokke ++

Dette gjøres i Java ved hjelp av observatør, observert
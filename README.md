# test_entex_18_04_2022
REST API with Authorization and Import CSV

1.Authorization

Noi la cursul de la Scoala Informala de IT am facut Autorizarea clasica cu Login si rute sub incidenta Login-uli
sau nu.Am incercat in timpul scurt pe care l-am avut sa invat si autorizarea API Rest.Am citit de pe situl oficial
al JSON Web Tokens si dupa alte cateva situri.Pare o chestie destul de stufoasa si timpul nu imi permite sa o duc
pana la capat.
In concluzie am mers pe Autorizarea clasica cu Login-formular si rute care se afla sau nu sub incidenta Login-ului.
Sper sa nu apara o confozie intre Entitatile : User(pt.logare) si UsersData.

2.Import CSV into database

Mentionez ca am un sistem de operare Linux - Ubuntu 20.4 si DBMS este postgresql
M-am conectat la psql si data base company pe care o aveam deja cu comanda : $ sudo -u postgres psql company
Odata conectat a aparut   company#= si am dat comanda in SQL : create database hello;
Am pornit aplicatia cu cele doua Entity creeate pt.: county si locality,ceea ce a creat automat in database hello
cele doua tabele : counties si localities.
Am dat comanda : $ sudo -u postgres psql hello  
pt.a putea intra in database hello.Dupa aceea am obtinut hello#=  si am dat comanda : select * from counties;  si 
select * from localities;   si am verificat cu atentie ca ordinea coloanelor sa fie identica cu cea din CSV-urile
corespunzatoare.
Pt.importul propriuzis am folosit comanda (fiind in continuare in database hello) :
hello#= copy counties from '/path/to/file/test-java-fullstack-county.csv' with(format csv,header);
Acelasi tip de comanda l-am folosit si pt.localities.
Pt.a creea table  users_data   am folosit Entity din Spring.

3.CRUD functionalities
Am creeat in REST endpointurile respective

5.Test check
Am folosit downloadurile de la Swagger-ui , am impresia ca sant mai clare.
 
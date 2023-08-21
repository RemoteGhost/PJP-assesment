# PJP-assesment
    Loo uus Sring Boot 3.x rakendus:
        Java 17
        Maven
    Loo objekt kolme täisarvulise atribuudiga, mis kajastavad kahte liidetavat ja nende summat
    Loo kontroller kahe teenusega:
        arvude liitmise teenus

                                                            i.      meetod: GET   
                                                           ii.      sisendid: võtab sisse kaks täisarvu

                    mõlemad peavad olema väärtustatud
                    lubatud väärtused: 0 - 100 (kaasa arvatud)

                                                           iii.      väljund: loob eelmises punktis mainitud objekti (kaks liidetavat ja                                                                                 summa) ja tagastab selle teenuse väljundis

        liitmiste otsimise teenus

                                                               i.      meetod: GET 
                                                               ii.     sisendid: 

                    täisarv: mittekohustuslik, lubatud väärtused: 0 - 100 (kaasa arvatud)
                    järjestust määrav atribuut: kohustuslik (peab võimaldama valida, kas järjestus tuleb kasvav või kahanev, atribuudi tüüp ei ole oluline)

                                                           iii.      väljund: 

                    kui sisendisse esitati täisarv, siis otsi varasemate liitmistehete hulgast need liitmised, kus üks liidetavatest või summa langeb selle arvuga kokku
                    vastavalt järjestamise atribuudile järjesta summa järgi kas kasvavalt või kahanevalt
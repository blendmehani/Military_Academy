
create type Adresa as object (
Qyteti varchar2(30),
Rruga varchar2(50),
Numri integer );


create or replace type Postimi as object ( 
Titulli varchar2(100),
Teksti varchar2(3500))


create index IndeksiAplikuesit on Aplikuesit( EmailAdresaA );

create index IndeksiUshtarit on Ushtaret(PozitaU);

create sequence Aplikuesit_seq
minvalue 1
increment by 1
nocache nocycle;

Create or replace trigger trg_Pozita
before insert on Ushtaret
for each row
begin
:new.PozitaU := 'Ushtar';
end;

create or replace trigger trg_AplikuesitSEQ
before insert on Aplikuesit
for each row
begin
 select Aplikuesit_seq.NEXTVAL
 into :new.AplikuesiId
 from dual;
end;

create sequence Ushtaret_seq
minvalue 1000000
increment by 1
nocache nocycle;

create or replace trigger trg_UshtaretSEQ
before insert on Ushtaret
for each row
begin
 select Ushtaret_seq.NEXTVAL
 into :new.UshtariId
 from dual;
end;

create sequence Togeret_seq
minvalue 100000
increment by 1
nocache nocycle;

create or replace trigger trg_TogeretSEQ
before insert on Togeret
for each row
begin
 select Togeret_seq.NEXTVAL
 into :new.TogeriId
 from dual;
end;

create sequence Gjeneralet_seq
minvalue 10000
increment by 1
nocache nocycle;

create or replace trigger trg_GjeneraletSEQ
before insert on Gjeneralet
for each row
begin
 select Gjeneralet_seq.NEXTVAL
 into :new.GjeneraliId
 from dual;
end;

create table Aplikuesit (
AplikuesiId integer primary key,
EmriA varchar2(20) not null,
MbiemriA varchar2(20) not null,
DataLindjesA date not null,
GjiniaA char(1) not null,
NrPersonalA integer not null
Constraint check_NrPersonal check (NrPersonalA between 1000000000 and 9999999999),
NrTelefonitA varchar2(40) not null,
EmailAdresaA varchar2(50) not null,
AdresaA Adresa,
constraint NrPersonal_unique unique (NrPersonalA)
)



create table Adminet (
AdminiId varchar2(50) primary key,
FjalekalimiA varchar2(20) not null)

insert into Adminet values ('123321','123321');


create table Njoftimet (
NjoftimiId integer primary key,
Njoftimi Postimi,
GjeneraliId integer,
Foreign key (GjeneraliId) references Gjeneralet(GjeneraliId))

select * from Ushtaret;

create table Ushtaret (
UshtariId integer primary key,
FjalekalimiU varchar2(20) not null,
EmriU varchar2(20) not null,
MbiemriU varchar2(20) not null,
DataLindjesU date not null, 
GjiniaU char(1) not null,
NrPersonalU number(10) not null,
NrTelefonitU varchar2(40) not null,
EmailAdresaU varchar2(50) not null,
AdresaU Adresa,
PozitaU varchar2(50),
foreign key (PozitaU) references GradaUshtarake(Pozita)
)
Insert into Ushtaret(FjaleKalimiU,EmriU,MbiemriU,DataLindjesU,GjiniaU,NrPersonalU,NrTelefonitU,EmailAdresaU,AdresaU,PozitaU) Values('1232633987','Drilon','Selimi','27-OCT-1996','M',1232633987,'045421642','drila7@hotmail.com',Adresa('Podujeve','Fshati Lluge',9),'Ushtar');
Insert into Ushtaret(FjaleKalimiU,EmriU,MbiemriU,DataLindjesU,GjiniaU,NrPersonalU,NrTelefonitU,EmailAdresaU,AdresaU,PozitaU) Values('1232633900','Blend','Mehani','20-NOV-1995','M',1232633900,'049877188','blendd.mehani@live.com',Adresa('Prishtine','Nazim Gafurri',64),'Ushtar');
Insert into Ushtaret(FjaleKalimiU,EmriU,MbiemriU,DataLindjesU,GjiniaU,NrPersonalU,NrTelefonitU,EmailAdresaU,AdresaU,PozitaU) Values('1232633810','Arben','Gashi','21-JUL-1992','M',1232633810,'045811188','arben.gashi@live.com',Adresa('Prishtine','Nazim Gafurri',14),'Tetar');
Insert into Ushtaret(FjaleKalimiU,EmriU,MbiemriU,DataLindjesU,GjiniaU,NrPersonalU,NrTelefonitU,EmailAdresaU,AdresaU,PozitaU) Values('1232639911','Berat','Berisha','12-JUN-1993','M',1232639911,'044221445','berat.berisha@live.com',Adresa('Prishtine','Ilir Konushevci',21),'Kapter');
Insert into Ushtaret(FjaleKalimiU,EmriU,MbiemriU,DataLindjesU,GjiniaU,NrPersonalU,NrTelefonitU,EmailAdresaU,AdresaU,PozitaU) Values('1232635887','Blerina','Krasniqi','07-DEC-1993','F',1232635887,'049321546','blerina.kras@gmail.com',Adresa('Prishtine','Agim Ramadani',5),'Kapter');



create table Togeret (
TogeriId integer primary key,
FjalekalimiT varchar2(20) not null,
EmriT varchar2(20) not null,
MbiemriT varchar2(20) not null,
DataLindjesT date not null,
GjiniaT char(1) not null,
NrPersonalT number(10) not null,
NrTelefonitT varchar2(40) not null,
EmailAdresaT varchar2(50) not null,
AdresaT Adresa,
PozitaT varchar2(50),
foreign key (PozitaT) references GradaUshtarake(Pozita)
)
select * from togeret;

create table Gjeneralet(
GjeneraliId integer primary key,
FjalekalimiG varchar2(20) not null,
EmriG varchar2(20) not null,
MbiemriG varchar2(20) not null,
DataLindjesG date not null,
GjiniaG char(1) not null,
NrPersonalG number(10) not null,
NrTelefonitG varchar2(40) not null,
EmailAdresaG varchar2(50) not null,
AdresaG Adresa,
PozitaG varchar2(50),
foreign key (PozitaG) references GradaUshtarake(Pozita) on delete cascade
)

create table GradaUshtarake(
Pozita varchar2(50) primary key,
bfile_loc bfile)


Insert into GradaUshtarake Values ('Ushtar',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\Ushtar.png'));
Insert into GradaUshtarake Values ('Tetar',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\Tetar.png'));
Insert into GradaUshtarake Values ('Rreshter',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\Rreshter.png'));
Insert into GradaUshtarake Values ('Kapter',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\Kapter.png'));
Insert into GradaUshtarake Values ('Rreshter Major',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\RreshterMajor.png'));
Insert into GradaUshtarake Values ('Rreshter I Pare',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\RreshterIPare.png'));

Insert into GradaUshtarake Values ('Nentoger',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\Nentoger.png'));
Insert into GradaUshtarake Values ('Toger',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\Toger.png'));
Insert into GradaUshtarake Values ('Kapiten',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\Kapiten.png'));
Insert into GradaUshtarake Values ('Major',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\Major.png'));
Insert into GradaUshtarake Values ('Nenkolonel',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\Nenkolonel.png'));
Insert into GradaUshtarake Values ('Kolonel',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\Kolonel.png'));

Insert into GradaUshtarake Values ('Gjeneral Brigade',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\GjeneralBrigade.png'));
Insert into GradaUshtarake Values ('Gjeneral Major',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\GjeneralMajor.png'));
Insert into GradaUshtarake Values ('Gjeneral Lejtenant',bfilename('GIF_FILES','c:\Users\Blendi\Desktop\Gradat\GjeneralLejtenant.png'));


CREATE
    TRIGGER trg_KohaPostimit BEFORE INSERT ON Postimet FOR EACH ROW 
BEGIN
     :new.KohaPostimit := current_timestamp;
END; 



create sequence Postimi_seq
minvalue 1
increment by 1
nocache nocycle;


create or replace trigger trg_PostimiSEQ
before insert on Postimet
for each row
begin
 select Postimi_seq.NEXTVAL
 into :new.PostimiId
 from dual;
end;



create table Postimet (
PostimiId integer primary key, 
TogeriId integer,
Postimi varchar2(500),
KohaPostimit TIMESTAMP,
foreign key (TogeriId) references Togeret(TogeriId))


delete from Postimet where TogeriId=100000;

Create view Njoftuesit as 
select t.EmriT, t.MbiemriT, p.Postimi, p.KohaPostimit
from Postimet p
inner join Togeret t on p.TogeriId = t.TogeriId;



insert into Togeret (FjaleKalimiT,EmriT,MbiemriT,DataLindjesT,GjiniaT,NrPersonalT,NrTelefonitT,EmailAdresaT,AdresaT,PozitaT) values ( 1232633888, 'Agim', 'Selimi', '20-FEB-1988', 'M', 1232633888, '045331242', 'a.selimi88@hotmail.com', Adresa('Prishtine', 'UCK', '11'), 'Toger');

select * from togeret;

create type LlojiUshtrimit as object (
Ushtrimi varchar(20),
Perseritjet varchar(500))

create type ListaUshtrimeve as table of LlojiUshtrimit;

create table Skedulimet (
Dita varchar(20),
Ushtrimet ListaUshtrimeve)
Nested table Ushtrimet store as UshtrimetDitore;



insert into Skedulimet (Dita, Ushtrimet) values ('E hene', ListaUshtrimeve 
                                                            (LlojiUshtrimit('Kardio','1 ore vrapim 8kmh'),
                                                             LlojiUshtrimit('Gjoks','Ngritje peshave 4 raunde nga 10 perseritje. 100 pompa.'),
                                                             LlojiUshtrimit('Kembe',''),
                                                             LlojiUshtrimit('Duar',''),
                                                             LlojiUshtrimit('Krahe',''),
                                                             LlojiUshtrimit('Shpine','')));


insert into Skedulimet (Dita, Ushtrimet) values ('E marte', ListaUshtrimeve 
                                                            (LlojiUshtrimit('Kardio','1 ore vrapim 8kmh'),
                                                             LlojiUshtrimit('Gjoks',''),
                                                             LlojiUshtrimit('Kembe','Ngritje peshave 4 raunde nga 10 perseritje. 100 squats.'),
                                                             LlojiUshtrimit('Duar',''),
                                                             LlojiUshtrimit('Krahe',''),
                                                             LlojiUshtrimit('Shpine','')));


insert into Skedulimet (Dita, Ushtrimet) values ('E merkure', ListaUshtrimeve 
                                                            (LlojiUshtrimit('Kardio','1 ore vrapim 8kmh'),
                                                             LlojiUshtrimit('Gjoks',''),
                                                             LlojiUshtrimit('Kembe',''),
                                                             LlojiUshtrimit('Duar','Ngritje peshave 4 raunde nga 10 perseritje. 100 biceps dhe 100 triceps pompa.'),
                                                             LlojiUshtrimit('Krahe',''),
                                                             LlojiUshtrimit('Shpine','')));


insert into Skedulimet (Dita, Ushtrimet) values ('E enjte', ListaUshtrimeve 
                                                            (LlojiUshtrimit('Kardio','1 ore vrapim 8kmh'),
                                                             LlojiUshtrimit('Gjoks',''),
                                                             LlojiUshtrimit('Kembe',''),
                                                             LlojiUshtrimit('Duar',''),
                                                             LlojiUshtrimit('Krahe','Ngritje peshave 4 raunde nga 10 perseritje.'),
                                                             LlojiUshtrimit('Shpine','')));


insert into Skedulimet (Dita, Ushtrimet) values ('E premte', ListaUshtrimeve 
                                                            (LlojiUshtrimit('Kardio','1 ore vrapim 8kmh'),
                                                             LlojiUshtrimit('Gjoks',''),
                                                             LlojiUshtrimit('Kembe',''),
                                                             LlojiUshtrimit('Duar',''),
                                                             LlojiUshtrimit('Krahe',''),
                                                             LlojiUshtrimit('Shpine','Ngritje peshave 4 raunde nga 10 perseritje.')));


insert into Skedulimet (Dita, Ushtrimet) values ('E shtune', ListaUshtrimeve 
                                                            (LlojiUshtrimit('Kardio','2 ore vrapim 8kmh'),
                                                             LlojiUshtrimit('Gjoks',''),
                                                             LlojiUshtrimit('Kembe',''),
                                                             LlojiUshtrimit('Duar',''),
                                                             LlojiUshtrimit('Krahe',''),
                                                             LlojiUshtrimit('Shpine','')));
--bitmap index
Create bitmap index Aplikuesi_Qyteti_Index on Aplikuesit a (a.AdresaA.Qyteti);

--funciton-based index
Create index EmriA_index ON Aplikuesit (INITCAP(EmriA));
Create index MbiemriA_index ON Aplikuesit (INITCAP(MbiemriA));

--Data dictionary
Select table_name From tabs; 
Select object_name, object_type From USER_OBJECTS; 
Select * From USER_OBJECTS where object_type = 'Cluster'; 

--rankimi
Select EmriA,MbiemriA,DataLindjesA,
Rank() over(order by DataLindjesA DESC) as Ranku_Sipas_Moshes
From Aplikuesit;

Select EmriU,MbiemriU,DataLindjesU,PozitaU,
Dense_Rank() over(Partition by PozitaU order by DataLindjesU DESC) as Ranku_Ushtarit_Sipas_Moshes
From Ushtaret;

--Recursive query
With Temp (PostimiId,TogeriId,KohaPostimit,RowNumber)
as(
Select p.PostimiId,
       p.TogeriId,
       p.KohaPostimit,
       Row_Number() Over (Partition by p.TogeriId order by p.KohaPostimit DESC) RowNumber
From Postimet p   )
Select t.TogeriId,
       t.EmriT,
       t.MbiemriT,
       l.PostimiId,
       l.KohaPostimit
From Temp l
inner join Togeret t on t.TogeriId=l.TogeriID
where l.RowNumber=1;

create table test(
emri varchar2(50) );


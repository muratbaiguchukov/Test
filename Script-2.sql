create table university(
id SERIAL primary key,
name_university varchar(200) 
);

insert into university(name_university)
values('KGTU');

insert into university(name_university)
values('KGUSTA');

insert into university(name_university)
values('KRSU');

insert into university(name_university)
values('Manas-U');

select * from university u; 


create table faculty(
id SERIAL primary key,
name_faculty varchar(150),
university_id integer  REFERENCES university (id) NOT NULL 
);

insert into faculty(name_faculty, university_id)
values('FAUP', 1);

insert into faculty(name_faculty, university_id)
values('FNIT', 2);

insert into faculty(name_faculty, university_id)
values('NTF', 3);

insert into faculty(name_faculty, university_id)
values('EF', 4);

select * from faculty f;

create table university_group(
id SERIAL primary key,
faculty_id integer REFERENCES faculty (id) NOT NULL,
group_code varchar(100)
);

insert into university_group(faculty_id, group_code) 
values(1, 'P-1-2018');

insert into university_group(faculty_id, group_code) 
values(2, 'A-20119');

insert into university_group(faculty_id, group_code) 
values(3, 'KR-2020');

insert into university_group(faculty_id, group_code) 
values(4, 'KT-EF-2021');

select * from university_group ug;


create table students_university(
id SERIAL primary key,
FIO varchar(160),
university_group_id integer REFERENCES university_group (id) NOT NULL, 
date_of_birth date
); 

insert into students_university(FIO, university_group_id, date_of_birth)
values('Галеев Мухиддин Исламович', 1, '1995-05-20');

insert into students_university(FIO, university_group_id, date_of_birth)
values('Шишкин Вячеслав Игоревич', 2, '1996-03-15');

insert into students_university(FIO, university_group_id, date_of_birth)
values('Оморов Азамат Кубанычбекович', 3, '1997-06-26');

insert into students_university(FIO, university_group_id, date_of_birth)
values('Таджидинов Ойбек Икрамович', 4, '1998-01-01');

select * from students_university su;

create table subjects(
id SERIAL primary key,
name_of_subjects varchar(100)
);

insert into subjects(name_of_subjects)
values('higher mathematics');

insert into subjects(name_of_subjects)
values('philosophy');

insert into subjects(name_of_subjects)
values('english');

insert into subjects(name_of_subjects)
values('programming');

select * from subjects s;

create table score(
id SERIAL primary key,
students_university_id integer REFERENCES students_university (id) NOT null,
score integer,
subjects_id integer REFERENCES subjects (id) NOT NULL  
);

insert into score(students_university_id, score, subjects_id)
values(1, 5, 4);

insert into score(students_university_id, score, subjects_id)
values(2, 3, 2);

insert into score(students_university_id, score, subjects_id)
values(3, 4, 1);

insert into score(students_university_id, score, subjects_id)
values(1, 2, 3);

select * from score s;

select p2.fullname as poset, t.fullname as trener, p.visiting_time , vs."name"  from posesheniy p 
join trenery t on t.id = p.trenery_id 
join posetitelli p2  on p2.id = p.posetitelli_id 
join vid_sporta vs on vs.id = t.vid_sporta_id 
where vs."name" = 'swimming'

select su.FIO, ug.group_code, f.name_faculty, u.name_university    
from score s join students_university su on su.id = s.students_university_id 
join university_group ug on ug.id = su.university_group_id
join faculty f on f.id = ug.faculty_id 
join university u on u.id = f.university_id




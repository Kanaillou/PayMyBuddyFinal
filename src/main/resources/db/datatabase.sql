create table User
(
    id         long not null auto_increment primary key,
    firstName varchar(30),
    lastName  varchar(30),
    email      varchar(50) UNIQUE,
    password   varchar(255),

);
--
--create table Account
--(
--    id     long           not null auto_increment primary key,
--    amount double precision not null,
--    date   datetime(6),
--    owner  bigint,
--    foreign key (owner) references User (id)
--);
--
--create table Transaction
--(
--    id       long           not null auto_increment primary key,
--    amount   double precision not null,
--    date     datetime(6),
--    tax      double precision not null,
--    receiver bigint,
--    sender   bigint,
--    foreign key (receiver) references Account (id),
--    foreign key (sender) references Account (id)
--);
--
--create table Credit_Card
--(
--    id                long not null auto_increment primary key,
--    name_Card         varchar(50),
--    associate_account bigint,
--    foreign key (associate_account) references Account (id)
--);


    alter table `administrator` 
       drop 
       foreign key FK_2a5vcjo3stlfcwadosjfq49l1;

    alter table `anonymous` 
       drop 
       foreign key FK_6lnbc6fo3om54vugoh8icg78m;

    alter table `audit_record` 
       drop 
       foreign key `FKdcrrgv6rkfw2ruvdja56un4ji`;

    alter table `audit_record` 
       drop 
       foreign key `FKlbvbyimxf6pxvbhkdd4vfhlnd`;

    alter table `auditor` 
       drop 
       foreign key FK_clqcq9lyspxdxcp6o4f3vkelj;

    alter table `authenticated` 
       drop 
       foreign key FK_h52w0f3wjoi68b63wv9vwon57;

    alter table `configuration_spam_words` 
       drop 
       foreign key `FK5lk29cpqe3960a943x8x8j4yh`;

    alter table `consumer` 
       drop 
       foreign key FK_6cyha9f1wpj0dpbxrrjddrqed;

    alter table `employer` 
       drop 
       foreign key FK_na4dfobmeuxkwf6p75abmb2tr;

    alter table `job` 
       drop 
       foreign key `FK3rxjf8uh6fh2u990pe8i2at0e`;

    alter table `mandatory_duty` 
       drop 
       foreign key `FKbtbut9e8de9qosvtm31cbdll8`;

    alter table `provider` 
       drop 
       foreign key FK_b1gwnjqm6ggy9yuiqm0o4rlmd;

    drop table if exists `administrator`;

    drop table if exists `announcement`;

    drop table if exists `anonymous`;

    drop table if exists `audit_record`;

    drop table if exists `auditor`;

    drop table if exists `authenticated`;

    drop table if exists `caballero_bulletin`;

    drop table if exists `challenge`;

    drop table if exists `company_record`;

    drop table if exists `configuration`;

    drop table if exists `configuration_spam_words`;

    drop table if exists `consumer`;

    drop table if exists `correa_bulletin`;

    drop table if exists `descriptor`;

    drop table if exists `employer`;

    drop table if exists `granja_bulletin`;

    drop table if exists `investor_record`;

    drop table if exists `job`;

    drop table if exists `mandatory_duty`;

    drop table if exists `morante_bulletin`;

    drop table if exists `offer`;

    drop table if exists `provider`;

    drop table if exists `request_`;

    drop table if exists `shout`;

    drop table if exists `user_account`;

    drop table if exists `hibernate_sequence`;

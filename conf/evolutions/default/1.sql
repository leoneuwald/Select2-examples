# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table job_model (
  i_job                     integer not null,
  name                      varchar(255),
  description               varchar(255),
  constraint pk_job_model primary key (i_job))
;

create sequence job_model_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists job_model;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists job_model_seq;


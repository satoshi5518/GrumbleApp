/* DB�����݂���ꍇ�͍폜 */
DROP DATABASE IF EXISTS postingdb;

/* ���[�U�̐��� */
DROP USER IF EXISTS postgres;
CREATE USER postgres WITH PASSWORD 'postgres' CREATEDB;

/* DB�̐��� */
CREATE DATABASE postingdb
  WITH OWNER = postgres
       ENCODING = 'UTF8';
\c postingdb postgres

/* �e�[�u�������݂���ꍇ�͍폜 */
DROP TABLE IF EXISTS posting;

/* �e�[�u���̐��� */
create table posting (
 id               int NOT NULL,
 post_contents     text,
 grumble_division  int,
 image            bytea,
 goos_count        int,
 contributor_name  varchar(10),
 ipAddres         cidr,
 post_date         date,
 logic_delet_flag   bool,
   constraint KEY_NAME primary key (
    id
  )
);

/* �e�[�u���̏��L����postgres�ɕύX */
ALTER TABLE posting
  OWNER TO postgres;
  
/* �e�X�g�f�[�^�̑}�� */
insert into posting VALUES(1,'���e�e�X�g1',null,null,0,'�e�X�g���Y1','192.168.240.1',now(),false);
insert into posting VALUES(2,'���e�e�X�g2',null,null,0,'�e�X�g���Y1','192.168.240.2',now(),false);
insert into posting VALUES(3,'���e�e�X�g3',null,null,0,'�e�X�g���Y1','192.168.240.3',now(),false);
insert into posting VALUES(4,'���e�e�X�g4',null,null,0,'�e�X�g���Y1','192.168.240.4',now(),false);
insert into posting VALUES(5,'���e�e�X�g5',null,null,0,'�e�X�g���Y1','192.168.240.5',now(),false);
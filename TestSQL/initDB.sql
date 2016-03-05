/* DBが存在する場合は削除 */
DROP DATABASE IF EXISTS postingdb;

/* ユーザの生成 */
DROP USER IF EXISTS postgres;
CREATE USER postgres WITH PASSWORD 'postgres' CREATEDB;

/* DBの生成 */
CREATE DATABASE postingdb
  WITH OWNER = postgres
       ENCODING = 'UTF8';
\c postingdb postgres

/* テーブルが存在する場合は削除 */
DROP TABLE IF EXISTS posting;

/* テーブルの生成 */
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

/* テーブルの所有権をpostgresに変更 */
ALTER TABLE posting
  OWNER TO postgres;
  
/* テストデータの挿入 */
insert into posting VALUES(1,'投稿テスト1',null,null,0,'テスト太郎1','192.168.240.1',now(),false);
insert into posting VALUES(2,'投稿テスト2',null,null,0,'テスト太郎1','192.168.240.2',now(),false);
insert into posting VALUES(3,'投稿テスト3',null,null,0,'テスト太郎1','192.168.240.3',now(),false);
insert into posting VALUES(4,'投稿テスト4',null,null,0,'テスト太郎1','192.168.240.4',now(),false);
insert into posting VALUES(5,'投稿テスト5',null,null,0,'テスト太郎1','192.168.240.5',now(),false);
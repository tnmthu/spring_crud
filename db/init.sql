--
-- PostgreSQL database dump
--

-- Dumped from database version 12.3
-- Dumped by pg_dump version 12.2

-- Started on 2020-06-30 09:46:57 UTC

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);       
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: metanet_admin
--

-- CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO metanet_admin;

--
-- TOC entry 2969 (class 0 OID 0)
-- Dependencies: 3
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: metanet_admin
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 203 (class 1259 OID 16396)
-- Name: projects; Type: TABLE; Schema: public; Owner: metanet_admin
--

CREATE TABLE public.projects (
    id integer NOT NULL,
    name character varying,
    owner character varying,
    description character varying,
    "startedDate" timestamp with time zone
);


ALTER TABLE public.projects OWNER TO metanet_admin;

--
-- TOC entry 202 (class 1259 OID 16386)
-- Name: users; Type: TABLE; Schema: public; Owner: metanet_admin
--

CREATE TABLE public.users (
    id integer NOT NULL,
    password character varying(1024) NOT NULL,
    username character varying(256) NOT NULL,
    fullname character varying(1024) NOT NULL
);


ALTER TABLE public.users OWNER TO metanet_admin;

--
-- TOC entry 2963 (class 0 OID 16396)
-- Dependencies: 203
-- Data for Name: projects; Type: TABLE DATA; Schema: public; Owner: metanet_admin--

COPY public.projects (id, name, owner, description, "startedDate") FROM stdin;    
\.


--
-- TOC entry 2962 (class 0 OID 16386)
-- Dependencies: 202
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: metanet_admin   
--

COPY public.users (id, password, username, fullname) FROM stdin;
\.


--
-- TOC entry 2833 (class 2606 OID 16405)
-- Name: projects projects_name_key; Type: CONSTRAINT; Schema: public; Owner: metanet_admin
--

ALTER TABLE ONLY public.projects
    ADD CONSTRAINT projects_name_key UNIQUE (name);


--
-- TOC entry 2835 (class 2606 OID 16403)
-- Name: projects projects_pkey; Type: CONSTRAINT; Schema: public; Owner: metanet_admin
--

ALTER TABLE ONLY public.projects
    ADD CONSTRAINT projects_pkey PRIMARY KEY (id);


--
-- TOC entry 2829 (class 2606 OID 16393)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: metanet_admin 
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 2831 (class 2606 OID 16395)
-- Name: users users_username_key; Type: CONSTRAINT; Schema: public; Owner: metanet_admin
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_username_key UNIQUE (username);


-- Completed on 2020-06-30 09:46:57 UTC

--
-- PostgreSQL database dump complete
--
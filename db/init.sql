--
-- PostgreSQL database dump
--

-- Dumped from database version 12.3
-- Dumped by pg_dump version 12.2

-- Started on 2020-07-01 03:11:58 UTC

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

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 205 (class 1259 OID 16418)
-- Name: projects; Type: TABLE; Schema: public; Owner: metanet_admin
--

CREATE TABLE public.projects (
    id integer NOT NULL,
    name character varying(256),
    owner_id integer,
    description character varying(1024),
    started_date time with time zone
);


ALTER TABLE public.projects OWNER TO metanet_admin;

--
-- TOC entry 204 (class 1259 OID 16416)
-- Name: projects_id_seq; Type: SEQUENCE; Schema: public; Owner: metanet_admin
--

CREATE SEQUENCE public.projects_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.projects_id_seq OWNER TO metanet_admin;

--
-- TOC entry 2974 (class 0 OID 0)
-- Dependencies: 204
-- Name: projects_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: metanet_admin
--

ALTER SEQUENCE public.projects_id_seq OWNED BY public.projects.id;


--
-- TOC entry 203 (class 1259 OID 16407)
-- Name: users; Type: TABLE; Schema: public; Owner: metanet_admin
--

CREATE TABLE public.users (
    id integer NOT NULL,
    username character varying(256) NOT NULL,
    password character varying(1024),
    fullname character varying(256)
);


ALTER TABLE public.users OWNER TO metanet_admin;

--
-- TOC entry 202 (class 1259 OID 16405)
-- Name: users_id_seq; Type: SEQUENCE; Schema: public; Owner: metanet_admin
--

CREATE SEQUENCE public.users_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.users_id_seq OWNER TO metanet_admin;

--
-- TOC entry 2975 (class 0 OID 0)
-- Dependencies: 202
-- Name: users_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: metanet_admin
--

ALTER SEQUENCE public.users_id_seq OWNED BY public.users.id;


--
-- TOC entry 2833 (class 2604 OID 16421)
-- Name: projects id; Type: DEFAULT; Schema: public; Owner: metanet_admin
--

ALTER TABLE ONLY public.projects ALTER COLUMN id SET DEFAULT nextval('public.projects_id_seq'::regclass);


--
-- TOC entry 2832 (class 2604 OID 16410)
-- Name: users id; Type: DEFAULT; Schema: public; Owner: metanet_admin
--

ALTER TABLE ONLY public.users ALTER COLUMN id SET DEFAULT nextval('public.users_id_seq'::regclass);


--
-- TOC entry 2968 (class 0 OID 16418)
-- Dependencies: 205
-- Data for Name: projects; Type: TABLE DATA; Schema: public; Owner: metanet_admin
--

COPY public.projects (id, name, owner_id, description, started_date) FROM stdin;
\.


--
-- TOC entry 2966 (class 0 OID 16407)
-- Dependencies: 203
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: metanet_admin
--

COPY public.users (id, username, password, fullname) FROM stdin;
\.


--
-- TOC entry 2976 (class 0 OID 0)
-- Dependencies: 204
-- Name: projects_id_seq; Type: SEQUENCE SET; Schema: public; Owner: metanet_admin
--

SELECT pg_catalog.setval('public.projects_id_seq', 1, false);


--
-- TOC entry 2977 (class 0 OID 0)
-- Dependencies: 202
-- Name: users_id_seq; Type: SEQUENCE SET; Schema: public; Owner: metanet_admin
--

SELECT pg_catalog.setval('public.users_id_seq', 1, false);


--
-- TOC entry 2837 (class 2606 OID 16426)
-- Name: projects projects_pkey; Type: CONSTRAINT; Schema: public; Owner: metanet_admin
--

ALTER TABLE ONLY public.projects
    ADD CONSTRAINT projects_pkey PRIMARY KEY (id);


--
-- TOC entry 2835 (class 2606 OID 16415)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: public; Owner: metanet_admin
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 2838 (class 2606 OID 16427)
-- Name: projects fk_owner_id; Type: FK CONSTRAINT; Schema: public; Owner: metanet_admin
--

ALTER TABLE ONLY public.projects
    ADD CONSTRAINT fk_owner_id FOREIGN KEY (owner_id) REFERENCES public.users(id) ON DELETE SET NULL;


-- Completed on 2020-07-01 03:11:58 UTC

--
-- PostgreSQL database dump complete
--
-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 30 Mei 2016 pada 07.16
-- Versi Server: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cafe`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `id` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  `hak_akses` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`id`, `pass`, `hak_akses`) VALUES
('arbi', 'arbi', 'Manager'),
('galang', 'galang', 'Pegawai');

-- --------------------------------------------------------

--
-- Struktur dari tabel `menu`
--

CREATE TABLE IF NOT EXISTS `menu` (
  `id_menu` int(255) NOT NULL,
  `nama_menu` varchar(255) NOT NULL,
  `harga_menu` int(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `menu`
--

INSERT INTO `menu` (`id_menu`, `nama_menu`, `harga_menu`) VALUES
(1, 'kopi', 1000),
(2, 'Kopi Ijo', 2000),
(3, 'Josua', 3000),
(4, 'Susu', 4000),
(5, 'Indomi', 5000),
(6, 'Rt.Mariam', 6000),
(7, 'K.Goreng', 7000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanan`
--

CREATE TABLE IF NOT EXISTS `pemesanan` (
  `id_pesan` int(255) NOT NULL,
  `atas_nama` varchar(255) NOT NULL,
  `jumlah` int(255) NOT NULL,
  `tanggal` varchar(255) NOT NULL,
  `total` int(255) NOT NULL,
  `nama_menu` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pemesanan`
--

INSERT INTO `pemesanan` (`id_pesan`, `atas_nama`, `jumlah`, `tanggal`, `total`, `nama_menu`) VALUES
(8, 'ulung', 1, 'jTextField1', 1000, 'kopi'),
(9, 'www', 1, '22-05-2017', 3000, 'kopi'),
(10, 'galang', 1, '22-05-2016', 1000, 'kopi'),
(11, 'yuyun', 1, '23-05-2016', 1000, 'kopi'),
(12, '', 1, '24-05-2016', 1000, 'kopi'),
(13, '', 1, '24-05-2016', 3000, 'Kopi Ijo'),
(14, '', 1, '24-05-2016', 3000, 'Kopi Ijo'),
(15, '', 1, '24-05-2016', 3000, 'Kopi Ijo'),
(16, '', 1, '24-05-2016', 3000, 'Kopi Ijo'),
(17, '', 1, '30-05-2016', 1000, 'kopi'),
(18, '', 1, '30-05-2016', 1000, 'kopi'),
(19, '', 1, '30-05-2016', 1000, 'kopi'),
(20, '', 1, '30-05-2016', 1000, 'kopi'),
(21, '', 3, '30-05-2016', 3000, 'kopi'),
(22, '', 1, '30-05-2016', 1000, 'kopi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id_menu`);

--
-- Indexes for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`id_pesan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `id_menu` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `pemesanan`
--
ALTER TABLE `pemesanan`
  MODIFY `id_pesan` int(255) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=23;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

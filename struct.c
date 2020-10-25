#include <stdio.h>

struct nilai{
 char mataKuliah[25];
 int nilaiMk;
};

struct mahasiswa {
 char nim[25];
 char nama[25];
 struct nilai dataNilai;
};

void main(){

 struct mahasiswa mhs1 = {"12345678910", "Who Am I",{"Struktur Data",90}};

 printf("\nNIM : %s\n",mhs1.nim);
 printf("Nama : %s\n",mhs1.nama);

 printf("Mata Kuliah : %s\n",mhs1.dataNilai.mataKuliah);
 printf("Nilai : %d\n",mhs1.dataNilai.nilaiMk);

}

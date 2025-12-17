#! /usr/bin/env zsh
# vim: ts=2:sw=2:noet:

for i in {0..30}; do
  numstr=${(l:4::0:)i}
  nameclase="Challenge${numstr}"
	namefile="${nameclase}.java"

  print "Clase: $numstr"
  print "Archivo: $namefile"
  print "Introduce contenido (escribe 'eos' para terminar):"

  > "$namefile"   # vacía/crea el archivo

  while true; do
    print -n "? > "
    read -r line < /dev/tty || break
    [[ $line == eos ]] && break
    print -- "$line" >> "$namefile"
  done

  print "Guardado en $namefile"
  print "---------------------"
done

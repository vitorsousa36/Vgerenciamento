@extends('adminlte::page')
@section('title', 'VGerenciamento - Home')

@section('content')

<ul class="list-group">
    <li class="list-group-item bg-purple">{{$Produto->descricao}}</li>
    <li class="list-group-item">Quantidade: {{$Produto->quantidade}}</li>
    <li class="list-group-item">Valor: {{$Produto->valor}}</li>
    <li class="list-group-item">Categoria: {{$Produto->Categoria->nome}}</li>
</ul>

@endsection

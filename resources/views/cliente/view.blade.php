@extends('adminlte::page')
@section('title', 'VGerenciamento - Home')

@section('content')
        <ul class="list-group">
            <li class="list-group-item bg-purple">{{$cliente->nome}}</li>
            <li class="list-group-item">Telefone: {{$cliente->telefone}}</li>
            <li class="list-group-item">Email: {{$cliente->email}}</li>
            <li class="list-group-item">Endereço: {{\App\Helper\ObjectHelper::formatEndereco($cliente->endereco)}}</li>
        </ul>
@endsection

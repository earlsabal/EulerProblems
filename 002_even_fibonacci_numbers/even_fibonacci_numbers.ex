defmodule EvenFibonacciNumbers do

  def evens_sum(limit), do: IO.puts "Answer: #{do_fib(0,1,0, limit)}"

  defp do_fib(_, current, result, limit) when current >= limit, do: result

  defp do_fib(prev, current, result, limit) when current < limit do
    sum = prev + current
    if rem(sum, 2) == 0, do: result = sum + result
    do_fib(current, sum, result, limit)
  end

end

# Used to track time
defmodule Benchmark do

  def measure(function) do
    function
    |> :timer.tc
    |> elem(0)
    |> Kernel./(1_000_000)
  end

end

IO.puts "Execution time: #{Benchmark.measure(fn -> 
  EvenFibonacciNumbers.evens_sum(4_000_000) end)}"

# Answer: 4613732
# Execution time: 0.001753

